package com.qiyei.android.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * 如果出现红色警告可以忽略，不会影响项目的编译和运行
 */
class PluginVersion : Plugin<Project> {
    override fun apply(project: Project) {
    }

    companion object {

    }
}
