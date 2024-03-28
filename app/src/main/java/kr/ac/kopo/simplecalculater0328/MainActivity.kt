package kr.ac.kopo.simplecalculater0328

import android.icu.number.IntegerWidth
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var edit1:EditText
    lateinit var edit2:EditText
    lateinit var btnPlus:Button
    lateinit var btnMinus:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivide:Button
    lateinit var textResult:TextView
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 위젯 객체의 참조값을 필드로 선언된 참조변수에 대입
        edit1 = findViewById<EditText>(R.id.edit1)
        edit2 = findViewById<EditText>(R.id.edit2)

        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)

        textResult = findViewById<TextView>(R.id.textResult)

        btnPlus.setOnClickListener {
            var num1 = edit1.text.toString().toInt()
            var num2 = edit2.text.toString().toInt()
            var result = num1 + num2
            textResult.text = "계산 결과: " + result
            false
        }
        btnMinus.setOnClickListener {
            var num1 = edit1.text.toString().toInt()
            var num2 = edit2.text.toString().toInt()
            var result = num1 - num2
            textResult.text = "계산 결과: " + result
            false
        }
        btnMultiply.setOnClickListener {
            var num1 = edit1.text.toString().toInt()
            var num2 = edit2.text.toString().toInt()
            var result = num1 * num2
            textResult.text = "계산 결과: " + result
            false
        }
        btnDivide.setOnClickListener {
            var num1 = edit1.text.toString().toInt()
            var num2 = edit2.text.toString().toInt()
            var result = num1 / num2
            textResult.text = "계산 결과: " + result
            false
        }
    }
}