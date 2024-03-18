package org.elixir.lang

import com.intellij.lang.Language

object ElixirLanguage: Language("Elixir", "text/elixir", "text/x-elixir", "application/x-elixir") {
    override fun isCaseSensitive(): Boolean = true
}
