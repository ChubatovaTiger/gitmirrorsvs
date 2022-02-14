package Gitmirrors.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Gitmirrors_Dd : GitVcsRoot({
    uuid = "7e401e4e-612a-4b39-bca6-13c79d0298bf"
    name = "dd"
    url = "dd"
    branch = "master"
    checkoutPolicy = GitVcsRoot.AgentCheckoutPolicy.NO_MIRRORS
})
