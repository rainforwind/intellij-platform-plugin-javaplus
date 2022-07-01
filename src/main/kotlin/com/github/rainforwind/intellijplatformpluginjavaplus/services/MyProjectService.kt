package com.github.rainforwind.intellijplatformpluginjavaplus.services

import com.intellij.openapi.project.Project
import com.github.rainforwind.intellijplatformpluginjavaplus.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
