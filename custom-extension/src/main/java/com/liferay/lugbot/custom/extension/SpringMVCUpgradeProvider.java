/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.lugbot.custom.extension;

import com.liferay.lugbot.api.LugbotConfig;
import com.liferay.lugbot.api.ProposalDTO;
import com.liferay.lugbot.api.UpgradeProvider;

import java.nio.file.Path;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.osgi.service.component.annotations.Component;

/**
 * @author Liferay
 */
@Component(name = "spring-mvc-portlet", service = UpgradeProvider.class)
public class SpringMVCUpgradeProvider implements UpgradeProvider {

	@Override
	public List<String> computePossibleUpgrades(Path repoPath, LugbotConfig lugbotConfig) {
		return Collections.emptyList();
	}

	@Override
	public Optional<ProposalDTO> provideUpgrade(Path repoPath, LugbotConfig lugbotConfig, String upgradeName) {
		return Optional.empty();
	}

}