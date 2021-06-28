package sx.example

import sx.example.swagger.JavaApi
import sx.example.swagger.JavaApiBrokenWithKt

/** works with kt-1.5.20 */
class Api : JavaApi {
    override fun test() {}
}

/** broken with kt-1.5.20 */
class ApiBrokenWithKt : JavaApiBrokenWithKt {
    override fun test() {}
}
