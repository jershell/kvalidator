package kvalidator

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject

open class LibraryTest {
    private val json = Json { allowStructuredMapKeys = true }
    internal val data = this::class.java.getResource("/data.json").readText().let { json.parseToJsonElement(it) }.jsonObject
}

