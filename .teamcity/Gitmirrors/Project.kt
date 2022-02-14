package Gitmirrors

import Gitmirrors.buildTypes.*
import Gitmirrors.vcsRoots.*
import Gitmirrors.vcsRoots.Gitmirrors_HttpsGithubComChubatovaTigerGitmirrorsvs
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "7dc0bdb2-1b45-4fd6-9eb6-dbe9a2e396d2"
    id("Gitmirrors")
    parentId("_Root")
    name = "gitmirrors"

    vcsRoot(Gitmirrors_HttpsGithubComChubatovaTigerChubatovaGradleTestsBackup)
    vcsRoot(Gitmirrors_HttpsGithubComChubatovaTigerGitmirrorsvs)

    buildType(Gitmirrors_A)
    buildType(Gitmirrors_B)

    features {
        versionedSettings {
            id = "PROJECT_EXT_4"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${Gitmirrors_HttpsGithubComChubatovaTigerGitmirrorsvs.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
