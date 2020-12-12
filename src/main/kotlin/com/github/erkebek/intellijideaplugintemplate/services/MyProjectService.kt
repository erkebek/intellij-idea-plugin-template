package com.github.erkebek.intellijideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.erkebek.intellijideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
