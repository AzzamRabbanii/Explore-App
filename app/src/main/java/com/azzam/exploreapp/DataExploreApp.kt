package com.azzam.exploreapp

object DataExploreApp {

    private val titleEifel = arrayOf(
        "Eifel",
        "Bali",
        "Hagia Sophia"
    )

    private val locationEifel = arrayOf(
        "France",
        "Indonesia",
        "Turkey"
    )

    private val descEifel = arrayOf(
        "The Eiffel Tower is a wrought-iron lattice tower on the Champ de Mars in Paris, France. It is named after the engineer Gustave Eiffel, whose company designed and built the tower.  ",
        "Bali is a province of Indonesia and the westernmost of the Lesser Sunda Islands. East of Java and west of Lombok, the province includes the island of Bali and a few smaller neighbouring islands, notably Nusa Penida, Nusa Lembongan, and Nusa Ceningan",
        "officially the Holy Hagia Sophia Grand Mosque, and formerly the Church of Hagia Sophia and formerly museum is a Late Antique place of worship in Istanbul, designed by the Greek geometers Isidore of Miletus and Anthemius of Tralles. "


    )


    private val photoEifel = arrayOf(
        "https://i.pinimg.com/originals/22/fb/e5/22fbe5660ea67663dc5adf8aa479b8de.jpg",
        "https://www.whisperwanderlust.com/wp-content/uploads/2017/08/9.jpg",
        "https://wallpapercave.com/wp/wp4710581.jpg",

    )

    val listEifel: ArrayList<DetailExplore>
        get() {
            val list = arrayListOf<DetailExplore>()
            for (data in descEifel.indices) {
                val detail = DetailExplore(
                    title = titleEifel[data],
                    location = locationEifel[data],
                    description = descEifel[data],
                    photo = photoEifel[data]
                )
                list.add(detail)
            }
            return list
        }
}