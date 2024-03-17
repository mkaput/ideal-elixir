package org.elixir.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerDescriptor
import org.elixir.ExBundle
import org.elixir.lang.ExFileTypeBase

@Suppress("UnstableApiUsage")
class ExLspServerDescriptor(project: Project) : LspServerDescriptor(project, ExBundle.message("lsp.elixir.presentableName")) {
    override fun isSupportedFile(file: VirtualFile): Boolean = file.fileType is ExFileTypeBase

    override fun createCommandLine(): GeneralCommandLine {
        return GeneralCommandLine("/Users/mk/Downloads/elixir-ls-v0.20.0/language_server.sh")
    }
}
