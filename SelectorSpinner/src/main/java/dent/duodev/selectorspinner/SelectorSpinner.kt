package dent.duodev.selectorspinner

import android.content.Context
import android.util.AttributeSet
import java.lang.Exception

class SelectorSpinner {

    private var pointerLength = 10
    private var stepValue = 1
    private var minValue = 0
    private var maxValue = 200

    constructor(context: Context) : super() {

    }

    constructor(context: Context, attrs: AttributeSet) : super() {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet) {
        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.SelectorScale,0,0)

        if (typedArray.hasValue(R.styleable.SelectorScale_pointerLength)) {
            this.pointerLength = typedArray.getDimensionPixelSize(R.styleable.SelectorScale_pointerLength, 0)
        }

        if (typedArray.hasValue(R.styleable.SelectorScale_stepValue)) {
            this.stepValue = typedArray.getInt(R.styleable.SelectorScale_stepValue, 0)
        }

        if (typedArray.hasValue(R.styleable.SelectorScale_minValue)) {
            this.minValue = typedArray.getInt(R.styleable.SelectorScale_minValue, 0)
        }

        if (typedArray.hasValue(R.styleable.SelectorScale_maxValue)) {
            this.maxValue = typedArray.getInt(R.styleable.SelectorScale_maxValue, 0)
        }

        if (minValue > maxValue) {
            throw Exception("Minimum value needs to be less than maximum value")
        }
    }

}