package org.elixir.lang

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import org.elixir.ElixirBundle
import javax.swing.Icon

abstract class ElixirFileTypeBase : LanguageFileType(ElixirLanguage) {
    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
}

object ElixirFileType : ElixirFileTypeBase() {
    override fun getName(): String = "Elixir"

    override fun getDescription(): String = ElixirBundle.message("filetype.elixir.description")

    override fun getDefaultExtension(): String = "ex"

    override fun getIcon(): Icon = AllIcons.FileTypes.Json
}

object ElixirScriptFileType : ElixirFileTypeBase() {
    override fun getName(): String = "Elixir script"

    override fun getDisplayName(): String = ElixirBundle.message("filetype.elixirScript.displayName")

    override fun getDescription(): String = ElixirBundle.message("filetype.elixirScript.description")

    override fun getDefaultExtension(): String = "exs"

    override fun getIcon(): Icon = AllIcons.FileTypes.Html
}
