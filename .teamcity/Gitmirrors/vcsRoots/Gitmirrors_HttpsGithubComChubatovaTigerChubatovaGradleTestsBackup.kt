package Gitmirrors.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Gitmirrors_HttpsGithubComChubatovaTigerChubatovaGradleTestsBackup : GitVcsRoot({
    uuid = "315a50a4-9ae6-499e-979b-080a1f8e05b3"
    name = "https://github.com/ChubatovaTiger/ChubatovaGradleTestsBackup"
    url = "https://github.com/ChubatovaTiger/ChubatovaGradleTestsBackup"
    //useMirrors = false
    checkoutPolicy = GitVcsRoot.AgentCheckoutPolicy.NO_MIRRORS
})
