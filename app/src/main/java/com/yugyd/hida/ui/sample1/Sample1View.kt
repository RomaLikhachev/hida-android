package com.yugyd.hida.ui.sample1

interface Sample1View {

    data class State(
        val isLoading: Boolean = false,
        val isError: Boolean = false,
        val title: String = "",
    )
}