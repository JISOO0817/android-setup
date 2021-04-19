package com.github.jisoo0817.androidsetup.services

import com.github.jisoo0817.androidsetup.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
