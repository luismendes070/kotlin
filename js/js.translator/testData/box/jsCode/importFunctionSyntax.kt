// KJS_WITH_FULL_RUNTIME

fun box(): String {
    if (js("import('hello')") !is kotlin.js.Promise<*>) return "fail1"

    return "OK"
}