package org.elixir.lsp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.LspServerSupportProvider.LspServerStarter
import org.elixir.lang.ElixirFileTypeBase

@Suppress("UnstableApiUsage")
class ElixirLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerStarter) {
        if (file.fileType is ElixirFileTypeBase) {
            serverStarter.ensureServerStarted(ElixirLspServerDescriptor(project))
        }
    }
}
