import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myhistoryapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaration
        val titleTextView = findViewById<TextView>(R.id.title)
        val enterAgeEditText = findViewById<EditText>(R.id.EnterAge)
        val clearButton = findViewById<Button>(R.id.clear)
        val searchButton = findViewById<Button>(R.id.search)
        val resultEditText = findViewById<EditText>(R.id.Result)

        // Information
        val steveBiko = "Steve Biko was born in Tylden, Eastern Cape, South Africa in 1946. As a medical student, he founded a black student organization in 1969 and created a national 'black consciousness' movement. The movement's aim was to combat racism and the South African apartheid government."
        val nelsonMandela = "Nelson Mandela was the first president of South Africa to be elected in a fully representative democratic election. He died at the age of 95."
        val desmondTutu = "Desmond Tutu was a South African Anglican archbishop best known for his opposition to apartheid in South Africa, for which he received the Nobel Prize for Peace in 1984."
        val helenBeatriceJoseph = "Helen Beatrice Joseph was a South African anti-apartheid activist. Born in Sussex, England, Helen graduated with a degree in English from the University of London in 1927 and then departed for India, where she taught for three years at Mahbubia School for girls in Hyderabad."
        val charlizeTheron = "Charlize Theron is a South African and American actress and producer. One of the world's highest-paid actresses, she is the recipient of various accolades, including an Academy Award and a Golden Globe Award. In 2016, Time named her one of the 100 most influential people in the world."
        val nkosiJohnson = "Nkosi Johnson was a South African child with HIV and AIDS who greatly influenced public perceptions of the pandemic and its effects before his death at the age of 12."
        val chrisHani = "Chris Hani was the leader of the South African Communist Party and chief of staff of uMkhonto we Sizwe, the armed wing of the African National Congress."
        val wesselJohannesCronje = "Wessel Johannes Cronje was a South African international cricketer and captain of the South Africa national cricket team in the 1990s. As captain, Cronje led his team to victory in 27 Test matches and 99 One Day Internationals."

        // Button click listener for search button
        searchButton.setOnClickListener {
            val research = enterAgeEditText.text.toString()
            if (research.isBlank()) {
                Toast.makeText(this, "Enter a value.", Toast.LENGTH_LONG).show()
            } else {
                val age = research.toInt()
                if (age < 20 || age > 100) {
                    Toast.makeText(this, "Enter an age between 20 and 100", Toast.LENGTH_LONG).show()
                } else {
                    val info = when (age) {
                        30 -> steveBiko
                        95 -> nelsonMandela
                        90 -> desmondTutu
                        87 -> helenBeatriceJoseph
                        48 -> charlizeTheron
                        12 -> nkosiJohnson
                        50 -> chrisHani
                        22 -> wesselJohannesCronje
                        else -> "Information not available for this age."
                    }
                    resultEditText.setText(info)
                }
            }
        }

        // Button click listener for clear button
        clearButton.setOnClickListener {
            enterAgeEditText.setText("")
            resultEditText.setText("")
        }
    }
}