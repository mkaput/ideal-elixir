package org.elixir.lsp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.LspServerSupportProvider.LspServerStarter
import org.elixir.lang.ExFileTypeBase

@Suppress("UnstableApiUsage")
class ExLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerStarter) {
        if (file.fileType is ExFileTypeBase) {
            serverStarter.ensureServerStarted(ExLspServerDescriptor(project))
        }
    }
}
