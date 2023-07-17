package com.simple.planet

import com.simple.planet.Question

object Constants {

    const val TOTAL_QUESTIONS:String = "total"
    const val CORRECT_ANSWERS:String = "correct"

    fun getLevel1(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val q1 = Question(
            1,
            "Which planet is closest to the Sun?",
            "Mars",
            "Earth",
            "Venus",
            "Mercury",
            4
        )
        questionsList.add(q1)

        val q2 = Question(
            2,
            "Which planet is known for its prominent ring system?",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune",
            2
        )
        questionsList.add(q2)

        val q3 = Question(
            3,
            "Which planet is often referred to as the \"Red Planet\"?",
            "Jupiter",
            "Mars",
            "Saturn",
            "Venus",
            2
        )
        questionsList.add(q3)

        val q4 = Question(
            4,
            "Which planet is the largest in our solar system?",
            "Jupiter",
            "Mars",
            "Saturn",
            "Earth",
            1
        )
        questionsList.add(q4)

        val q5 = Question(
            5,
            "Which planet has the most moons?",
            "Mars",
            "Earth",
            "Jupiter",
            "Saturn",
            3
        )
        questionsList.add(q5)

        val q6 = Question(
            6,
            "Which planet is known for its Great Red Spot?",
            "Mars",
            "Earth",
            "Saturn",
            "Jupiter",
            4
        )
        questionsList.add(q6)

        val q7 = Question(
            7,
            "Which planet has a tilted axis, causing extreme seasons?",
            "Earth",
            "Venus",
            "Uranus",
            "Neptune",
            3
        )
        questionsList.add(q7)

        val q8 = Question(
            8,
            "Which planet is known for its beautiful and distinct rings?",
            "Mercury",
            "Earth",
            "Saturn",
            "Uranus",
            3
        )
        questionsList.add(q8)

        val q9 = Question(
            9,
            "Which planet is often referred to as the \"Blue Planet\"?",
            "Uranus",
            "Earth",
            "Mars",
            "Neptune",
            2
        )
        questionsList.add(q9)

        val q10 = Question(
            10,
            "Which planet is known for its thin rings made up of ice particles?",
            "Saturn",
            "Earth",
            "Mars",
            "Jupiter",
            1
        )
        questionsList.add(q10)

        return questionsList
    }

    fun getLevel2(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val q1 = Question(
            1,
            "Which planet is often referred to as the \"Giant of the Solar System\"?",
            "Mars",
            "Jupiter",
            "Venus",
            "Saturn",
            2
        )
        questionsList.add(q1)

        val q2 = Question(
            2,
            "Which planet is known for its active volcanoes and sulfuric acid clouds?",
            "Earth",
            "Mars",
            "Venus",
            "Neptune",
            3
        )
        questionsList.add(q2)

        val q3 = Question(
            3,
            "Which planet has the highest average surface temperature in our solar system?",
            "Venus",
            "Earth",
            "Mercury",
            "Mars",
            1
        )
        questionsList.add(q3)

        val q4 = Question(
            4,
            "Which planet has a dense atmosphere composed mainly of carbon dioxide?",
            "Saturn",
            "Mars",
            "Jupiter",
            "Venus",
            4
        )
        questionsList.add(q4)

        val q5 = Question(
            5,
            "Which planet has the longest orbital period in our solar system?",
            "Mercury",
            "Uranus",
            "Saturn",
            "Neptune",
            4
        )
        questionsList.add(q5)

        val q6 = Question(
            6,
            "Which planet is known for its hexagonal storm at its north pole?",
            "Saturn",
            "Jupiter",
            "Neptune",
            "Venus",
            1
        )
        questionsList.add(q6)

        val q7 = Question(
            7,
            "Which planet is often referred to as the \"Evening Star\" or \"Morning Star\"?",
            "Mars",
            "Venus",
            "Earth",
            "Mercury",
            2
        )
        questionsList.add(q7)

        val q8 = Question(
            8,
            "Which planet has the highest number of known moons?",
            "Saturn",
            "Earth",
            "Neptune",
            "Jupiter",
            4
        )
        questionsList.add(q8)

        val q9 = Question(
            9,
            "Which planet has a permanent hexagonal cloud pattern at its north pole?",
            "Uranus",
            "Mars",
            "Earth",
            "Saturn",
            4
        )
        questionsList.add(q9)

        val q10 = Question(
            10,
            "Which planet has a prominent feature called \"Valles Marineris\"?",
            "Venus",
            "Uranus",
            "Mars",
            "Earth",
            3
        )
        questionsList.add(q10)

        return questionsList
    }

    fun getLevel3(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val q1 = Question(
            1,
            "Which planet has the most elliptical (eccentric) orbit in our solar system?",
            "Earth",
            "Venus",
            "Pluto",
            "Mercury",
            4
        )
        questionsList.add(q1)

        val q2 = Question(
            2,
            "Which planet has the highest number of known rings?",
            "Mars",
            "Saturn",
            "Earth",
            "Uranus",
            1
        )
        questionsList.add(q2)

        val q3 = Question(
            3,
            "Which planet has a moon named \"Triton\" that orbits in the opposite direction of the planet's rotation?",
            "Uranus",
            "Earth",
            "Neptune",
            "Mars",
            2
        )
        questionsList.add(q3)

        val q4 = Question(
            4,
            "Which planet has the strongest magnetic field in our solar system?",
            "Saturn",
            "Jupiter",
            "Mars",
            "Earth",
            2
        )
        questionsList.add(q4)

        val q5 = Question(
            5,
            "Which planet has a moon named \"Io\" that is known for its intense volcanic activity?",
            "Jupiter",
            "Uranus",
            "Earth",
            "Mars",
            1
        )
        questionsList.add(q5)

        val q6 = Question(
            6,
            "Which planet has a moon named \"Phobos\" and \"Deimos\"?",
            "Neptune",
            "Saturn",
            "Mercury",
            "Mars",
            3
        )
        questionsList.add(q6)

        val q7 = Question(
            7,
            "Which planet has a moon named \"Ganymede\" that is the largest moon in our solar system?",
            "Earth",
            "Saturn",
            "Mars",
            "Jupiter",
            1
        )
        questionsList.add(q7)

        val q8 = Question(
            8,
            "Which planet has a moon named \"Titan\" that has a thick atmosphere and hydrocarbon lakes?",
            "Mars",
            "Earth",
            "Uranus",
            "Saturn",
            4
        )
        questionsList.add(q8)

        val q9 = Question(
            9,
            "Which planet has a moon named \"Europa\" that is believed to have a subsurface ocean?",
            "Mars",
            "Jupiter",
            "Earth",
            "Venus",
            4
        )
        questionsList.add(q9)

        val q10 = Question(
            10,
            "Which planet has a moon named \"Charon\" that is relatively large compared to the planet itself?",
            "Mars",
            "Earth",
            "Pluto",
            "Uranus",
            3
        )
        questionsList.add(q10)

        return questionsList
    }
}