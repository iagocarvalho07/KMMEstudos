package com.iagocarvalho.kmmestudos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform