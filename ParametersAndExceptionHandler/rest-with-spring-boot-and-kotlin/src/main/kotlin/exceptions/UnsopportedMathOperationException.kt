package exceptions

import java.lang.Exception
import java.lang.RuntimeException

class UnsopportedMathOperationException(exception: String?): RuntimeException(exception) {

}
