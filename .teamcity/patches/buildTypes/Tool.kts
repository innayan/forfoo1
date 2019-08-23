package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'Tool'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, BuildType({
    id("Tool")
    name = "tool"

    steps {
        script {
            scriptContent = "echo %teamcity.tool.maven.3.5.0-beta-1%"
        }
    }

    requirements {
        exists("teamcity.tool.TestReport")
    }
}))

