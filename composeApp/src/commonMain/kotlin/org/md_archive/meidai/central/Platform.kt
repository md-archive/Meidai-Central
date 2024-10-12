package org.md_archive.meidai.central

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform