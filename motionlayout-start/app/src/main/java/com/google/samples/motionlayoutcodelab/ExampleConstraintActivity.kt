package com.google.samples.motionlayoutcodelab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_example_constraint.*


class ExampleConstraintActivity : AppCompatActivity() {

    private var isStart = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_constraint)

        val constraintSet = ConstraintSet()
        constraintSet.clone(parent_constraint)

        img_constraint.setOnClickListener {
            isStart = !isStart

            if (!isStart) {
                constraintSet.clear(R.id.img_constraint, ConstraintSet.BOTTOM)
                constraintSet.connect(
                    R.id.img_constraint,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT,
                    0
                )
                constraintSet.connect(
                    R.id.img_constraint,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT,
                    0
                )

                constraintSet.connect(
                    R.id.img_constraint,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP,
                    16
                )
            } else {
                constraintSet.clear(R.id.img_constraint, ConstraintSet.TOP)
                constraintSet.connect(
                    R.id.img_constraint,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT,
                    0
                )
                constraintSet.connect(
                    R.id.img_constraint,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT,
                    0
                )

                constraintSet.connect(
                    R.id.img_constraint,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM,
                    16
                )
            }
            constraintSet.applyTo(parent_constraint)
        }

    }
}