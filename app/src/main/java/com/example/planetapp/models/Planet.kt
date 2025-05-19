package com.example.planetapp.models

import com.example.planetapp.R

data class Planet(
    val id: Int,
    val name: String,
    val type: String,
    val galaxy: String,
    val distanceFromSun: String,
    val diameter: String,
    val characteristics: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)



val planetList = listOf(
    Planet(
        id = 1,
        name = "Mercury",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "57.9 million km",
        diameter = "4,879 km",
        characteristics = "Smallest planet, no atmosphere, extreme temperature variations.",
        imageRes = R.drawable.mercurio // Assuming you have R.drawable.mercurio
    ),
    Planet(
        id = 2,
        name = "Venus",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "108.2 million km",
        diameter = "12,104 km",
        characteristics = "Hottest planet, thick toxic atmosphere, retrograde rotation.",
        imageRes = R.drawable.venus // Assuming you have R.drawable.venus
    ),
    Planet(
        id = 3,
        name = "Earth",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "149.6 million km",
        diameter = "12,742 km",
        characteristics = "Supports life, has liquid water and a protective atmosphere.",
        imageRes = R.drawable.terra // Assuming you have R.drawable.earth (changed from saturno for Earth)
    ),
    Planet(
        id = 4,
        name = "Mars",
        type = "Terrestrial",
        galaxy = "Milky Way",
        distanceFromSun = "227.9 million km",
        diameter = "6,779 km",
        characteristics = "The Red Planet, thin atmosphere, polar ice caps, largest volcano (Olympus Mons).",
        imageRes = R.drawable.marte // Assuming you have R.drawable.mars
    ),
    Planet(
        id = 5,
        name = "Jupiter",
        type = "Gas Giant",
        galaxy = "Milky Way",
        distanceFromSun = "778.5 million km",
        diameter = "139,820 km",
        characteristics = "Largest planet, Great Red Spot (a giant storm), strong magnetic field, many moons.",
        imageRes = R.drawable.jupiter // Assuming you have R.drawable.jupiter
    ),
    Planet(
        id = 6,
        name = "Saturn",
        type = "Gas Giant",
        galaxy = "Milky Way",
        distanceFromSun = "1.4 billion km",
        diameter = "116,460 km",
        characteristics = "Known for its prominent ring system, low density (could float in water).",
        imageRes = R.drawable.saturno // You already had this for Earth, I'm keeping it for Saturn
    ),
    Planet(
        id = 7,
        name = "Uranus",
        type = "Ice Giant",
        galaxy = "Milky Way",
        distanceFromSun = "2.9 billion km",
        diameter = "50,724 km",
        characteristics = "Rotates on its side, blue-green color due to methane, faint ring system.",
        imageRes = R.drawable.urano // Assuming you have R.drawable.uranus
    ),
    Planet(
        id = 8,
        name = "Neptune",
        type = "Ice Giant",
        galaxy = "Milky Way",
        distanceFromSun = "4.5 billion km",
        diameter = "49,244 km",
        characteristics = "Strongest winds in the solar system, deep blue color, Great Dark Spot (transient).",
        imageRes = R.drawable.netuno // Assuming you have R.drawable.neptune
    ),

    Planet(
        id = 9,
        name = "Pluto",
        type = "Dwarf Planet",
        galaxy = "Milky Way",
        distanceFromSun = "5.9 billion km",
        diameter = "2,376 km",
        characteristics = "Located in the Kuiper Belt, has a heart-shaped glacier, thin nitrogen atmosphere.",
        imageRes = R.drawable.plutao // Assuming you have R.drawable.pluto
    ),

)




