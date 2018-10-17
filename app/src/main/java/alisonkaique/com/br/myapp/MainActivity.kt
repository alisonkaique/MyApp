package alisonkaique.com.br.myapp

import alisonkaique.com.br.mylibrary.demo.Calculator
import alisonkaique.com.br.mylibrary.toast.CustomToast
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculator = Calculator()

        calculator.sum(1, 1)

        val customToast = CustomToast(this, layoutInflater)

        if(BuildConfig.REPORT_CRASH) {
            customToast.showToast("Crash Ligado", CustomToast.WARNING)
            customToast.showToast("Crash Ligado", CustomToast.INFO)
            customToast.showToast("Crash Ligado", CustomToast.ERROR)
            customToast.showToast("Crash Ligado", CustomToast.SUCCESS)
            //Toast.makeText(this, "Crash Ligado", Toast.LENGTH_SHORT).show()
        } else {

            customToast.showToast("Crash Desligado", CustomToast.SUCCESS)
            //Toast.makeText(this, "Crash Desligado", Toast.LENGTH_SHORT).show()
        }
    }
}
