package com.github.kittinunf.fuel.core

import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection

internal class DefaultHook : Client.Hook {
    override fun preConnect(connection: HttpURLConnection, request: Request) {
        // no-op
    }

    override fun interpretResponseStream(inputStream: InputStream): InputStream = inputStream

    override fun postConnect() {
        // no-op
    }

    override fun httpExchangeFailed(exception: IOException) {
        // no-op
    }
}