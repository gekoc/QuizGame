package com.example.flagsquiz

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_of_turkey,
            "Lithuania",
            "Turkey",
            "Pakistan",
            "Chile",
            2
        )
        questionList.add(que1)

        val que2 = Question(
        2,
        "What is this?",
        R.drawable.red_onion,
        "A spoon",
        "A plane",
        "An ostrich",
        "An onion",
        4
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the capital of Turkey",
            R.drawable.yozgat,
            "Yozgat",
            "Istanbul",
            "Ankara",
            "Antalya",
            3
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "Abızıttın mı?",
            R.drawable.abizittin_mi,
            "Ha?",
            "Ne?",
            "Yes",
            "What?",
        1
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "Who is this football player?",
            R.drawable.amisulashvili,
            "Roberto Carlos",
            "Maradona",
            "Amisulashvili",
            "Hagi",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "In state of Georgia, what is illegal to eat with a fork?",
            R.drawable.fork,
            "Rice",
            "Fried Chicken",
            "Burger",
            "Soup",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What element unites with Oxygen and makes water?",
            R.drawable.hidrojen,
            "Hydrogen",
            "Carbon",
            "Fiber",
            "Plutonium",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "Which East European City is famous for its Basketball team?",
            R.drawable.kaunas_zalgirio_arena,
            "Riga",
            "Warsaw",
            "Kaunas",
            "Gdansk",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "The speed of what is measured in \" Mickeys\" ?",
            R.drawable.mickey,
            "A cassette",
            "An electric fan",
            "A computer mouse",
            "A hybrid car",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "How many teeth does an adult human have?",
            R.drawable.teeth,
            "One",
            "12 if human is meth user",
            "36",
            "32",
            4
        )
        questionList.add(que10)


        return questionList
    }

}