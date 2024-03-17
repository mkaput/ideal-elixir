package org.elixir.lang

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import org.elixir.ExBundle
import javax.swing.Icon

abstract class ExFileTypeBase : LanguageFileType(ExLanguage) {
    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
}

object ExFileType : ExFileTypeBase() {
    override fun getName(): String = "Elixir"

    override fun getDescription(): String = ExBundle.message("filetype.elixir.description")

    override fun getDefaultExtension(): String = "ex"

    override fun getIcon(): Icon = AllIcons.FileTypes.Json
}

object ExScriptFileType : ExFileTypeBase() {
    override fun getName(): String = "Elixir script"

    override fun getDisplayName(): String = ExBundle.message("filetype.elixirScript.displayName")

    override fun getDescription(): String = ExBundle.message("filetype.elixirScript.description")

    override fun getDefaultExtension(): String = "exs"

    override fun getIcon(): Icon = AllIcons.FileTypes.Html
}
