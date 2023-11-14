package com.yugyd.hida.data.sample1

import kotlinx.coroutines.flow.flow

class Sample1RepositoryImpl : Sample1Repository {
    override fun getData() = flow {
        emit("Sample1")
    }
}
