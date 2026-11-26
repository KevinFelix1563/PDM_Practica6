package com.example.catalogobajacalifornia.data

import com.example.catalogobajacalifornia.model.LugarTuristico

/**
 * Catálogo fijo con los 12 destinos turísticos representativos de Baja California
 * y el banner panorámico para la pantalla de Inicio.
 */
object CatalogoLugares {

    const val BANNER_INICIO_URL =
        "https://cdn.prod.website-files.com/669abf662c877ad8274fe68a/6a7b64e43edd2eb4fd487d9a_it-s-very-beautiful-from_result.webp"

    val lugares: List<LugarTuristico> = listOf(
        LugarTuristico(
            id = 1,
            nombre = "Bosque y Zoológico de la Ciudad",
            municipio = "Mexicali",
            descripcion = "El Bosque y Zoológico de la Ciudad es el pulmón verde más tradicional de Mexicali, un punto de encuentro familiar que contrasta con el clima árido del valle. Sus extensas áreas arboladas ofrecen sombra natural, andadores amplios y palapas ideales para días de campo durante todo el año.\n\n" +
                "Dentro del recinto se resguardan diversas especies de mamíferos, reptiles y aves en espacios educativos como el aviario, el herpetario y la zona del lago artificial, donde también operan lanchas de pedales y un tren panorámico para recorrer el parque.\n\n" +
                "Además de su enfoque recreativo y de conservación, el complejo alberga el Museo de Historia Natural y jardines botánicos con flora regional, convirtiéndolo en una parada imprescindible para conocer la biodiversidad del noroeste de México.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/503/A1_503.jpg"
        ),
        LugarTuristico(
            id = 2,
            nombre = "Centro Cultural Tijuana (CECUT)",
            municipio = "Tijuana",
            descripcion = "Inaugurado en 1982 en la Zona Río, el Centro Cultural Tijuana (CECUT) es el complejo cultural más importante del noroeste de México y un ícono arquitectónico diseñado por Pedro Ramírez Vázquez y Manuel Rosen Morrison.\n\n" +
                "Su emblemática esfera conocida popularmente como \"La Bola\" alberga un cine Domo IMAX donde se proyectan documentales científicos y naturales en gran formato. El recinto también cuenta con la galería internacional El Cubo, la Cineteca Carlos Monsiváis, un acuario regional y un jardín botánico.\n\n" +
                "En el Museo de las Californias los visitantes pueden recorrer la historia peninsular desde los primeros pobladores y el periodo misional hasta la consolidación moderna de la frontera norte, complementado con festivales, conciertos y teatro durante todo el año.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/15/A1_15.jpg"
        ),
        LugarTuristico(
            id = 3,
            nombre = "La Bufadora",
            municipio = "Ensenada",
            descripcion = "Ubicada en la península de Punta Banda, al sur de la ciudad de Ensenada, La Bufadora es uno de los géiseres marinos más grandes de América del Norte y un espectáculo geológico impresionante frente al océano Pacífico.\n\n" +
                "El fenómeno ocurre cuando las olas entran a presión dentro de una cueva submarina formada entre los acantilados de roca volcánica; al quedar comprimido el aire y el agua, el chorro es expulsado verticalmente superando los 20 metros de altura acompañado de un bramido característico.\n\n" +
                "El camino hacia el mirador está rodeado de puestos de artesanías mexicanas, almejas gratinadas, churros y miradores costeros desde donde, entre diciembre y abril, también es posible avistar ballenas grises en su ruta migratoria.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/11/A1_11.jpg"
        ),
        LugarTuristico(
            id = 4,
            nombre = "Valle de Guadalupe",
            municipio = "Ensenada",
            descripcion = "El Valle de Guadalupe, situado a unos treinta minutos al norte de Ensenada, es el corazón vitivinícola más importante de México, responsable de gran parte de la producción nacional de vino de mesa gracias a su microclima mediterráneo.\n\n" +
                "A lo largo de la Ruta del Vino —entre San Antonio de las Minas, Francisco Zarco y El Porvenir— conviven más de cien casas vinícolas que van desde bodegas históricas de gran escala hasta proyectos familiares de autor con arquitectura contemporánea integrada al paisaje semidesértico.\n\n" +
                "La experiencia se completa con la reconocida gastronomía Baja Med, que combina ingredientes frescos del huerto, aceite de oliva regional y pescados y mariscos del Pacífico en restaurantes campestres, hoteles boutique y el Museo de la Vid y el Vino.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/874/A1_874.jpg"
        ),
        LugarTuristico(
            id = 5,
            nombre = "La Rumorosa",
            municipio = "Tecate",
            descripcion = "La Rumorosa es un paso montañoso de la Sierra de Juárez en el municipio de Tecate, famoso por las monumentales formaciones de roca granítica apiladas por la erosión y por el peculiar sonido que produce el viento al atravesarlas, origen de su nombre.\n\n" +
                "Su tramo de autopista descendente hacia la Laguna Salada regala algunas de las vistas panorámicas más espectaculares de Baja California, con miradores acondicionados como Ojo de Águila y el monumento al Borrego Cimarrón.\n\n" +
                "En las cercanías del poblado se ubica la zona arqueológica El Vallecito, donde se conservan pinturas rupestres de los antiguos habitantes kumiai, entre ellas la célebre figura solar de \"El Diablito\", además de senderos para ciclismo de montaña y escalada.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/1646/A1_1646.jpg"
        ),
        LugarTuristico(
            id = 6,
            nombre = "Parque Nacional Constitución de 1857 (Laguna Hanson)",
            municipio = "Ensenada",
            descripcion = "Enclavado en lo alto de la Sierra de Juárez, a más de 1,600 metros sobre el nivel del mar, el Parque Nacional Constitución de 1857 protege un bosque templado de pino ponderosa, pino piñonero y encino que sorprende al visitante por su contraste alpino.\n\n" +
                "El corazón del parque es la Laguna Hanson, un cuerpo de agua natural rodeado de enormes bloques de granito blanco y praderas que en invierno llegan a cubrirse de nieve, creando postales únicas en la península.\n\n" +
                "Es un destino predilecto para el campismo, el senderismo, el avistamiento de aves acuáticas y la renta de cabañas rústicas bajo cielos nocturnos despejados y libres de contaminación lumínica.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/12/A1_12.jpg"
        ),
        LugarTuristico(
            id = 7,
            nombre = "Playas de Rosarito",
            municipio = "Playas de Rosarito",
            descripcion = "Playas de Rosarito se extiende a lo largo de la costa del océano Pacífico al sur de Tijuana y combina amplias franjas de arena dorada con un ambiente turístico vibrante, paseos a caballo frente al mar y atardeceres despejados.\n\n" +
                "Sus playas son reconocidas internacionalmente para la práctica del surf y el buceo recreativo en el Parque Submarino Rosarito, mientras que la cercanía con los Estudios Baja y el muelle histórico le otorgan un carácter único.\n\n" +
                "En el ámbito culinario destaca la comunidad pesquera de Puerto Nuevo, famosa mundialmente por su langosta frita en manteca servida con frijoles, arroz, salsa picante y tortillas de harina hechas a mano.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/2224/A1_2224.jpg"
        ),
        LugarTuristico(
            id = 8,
            nombre = "Malecón de San Felipe",
            municipio = "San Felipe",
            descripcion = "El Malecón de San Felipe es el paseo costero principal del puerto más septentrional del Mar de Cortés, un punto de reunión donde el desierto bajacaliforniano se encuentra directamente con aguas cálidas y mansas.\n\n" +
                "A lo largo de su andador frente a la bahía se distribuyen palapas, restaurantes de mariscos frescos, tiendas de artesanías y miradores desde los cuales se observa el fenómeno de las amplias mareas del alto Golfo de California.\n\n" +
                "Es también el punto de partida para saborear los tradicionales tacos de pescado estilo Baja California, recorrer en lancha hacia la Isla Consag o visitar el cercano Valle de los Gigantes, hogar de cardones centenarios.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/1388/A1_1388.jpg"
        ),
        LugarTuristico(
            id = 9,
            nombre = "Cañón de Guadalupe",
            municipio = "Mexicali",
            descripcion = "Escondido en las estribaciones orientales de la Sierra de Juárez, al oeste de la Laguna Salada, el Cañón de Guadalupe es un oasis natural que emerge entre imponentes paredes de granito en medio del desierto de Mexicali.\n\n" +
                "Sus manantiales geotérmicos brotan a temperaturas cercanas a los 50 grados Celsius y son canalizados hacia pozas y tinas de piedra privadas integradas en las áreas de campamento, rodeadas de palmas azules y de abanico endémicas.\n\n" +
                "Durante los meses templados de otoño a primavera ofrece rutas de senderismo hacia cascadas estacionales, cañones con petroglifos y pinturas rupestres cucapá, además de cielos oscuros excepcionales para observar las estrellas.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/504/A1_504.jpg"
        ),
        LugarTuristico(
            id = 10,
            nombre = "Avenida Revolución",
            municipio = "Tijuana",
            descripcion = "Conocida afectuosamente como \"La Revu\", la Avenida Revolución es la vialidad histórica más emblemática del centro de Tijuana y un símbolo vivo de la cultura fronteriza desde inicios del siglo XX.\n\n" +
                "Entre el Arco Monumental del Reloj y el histórico Palacio Frontón Jai Alai de arquitectura morisca se alinean comercios de artesanías, cafés de especialidad, cervecerías artesanales, restaurantes y los pintorescos \"burros-cebra\" declarados patrimonio cultural.\n\n" +
                "En este corredor nació la célebre ensalada César en el Hotel Caesar's en la década de 1920, y a pocos pasos se abren paso el Pasaje Rodríguez y el Pasaje Gómez con murales, librerías y galerías de arte independiente.",
            imagenUrl = "https://cdn.prod.website-files.com/669abf662c877ad8274fe68a/6b00bf47d108e30d64012fb0_unobstructed%20tijuana%20historic%20centre%20sign_result.webp"
        ),
        LugarTuristico(
            id = 11,
            nombre = "Parque Nacional Sierra de San Pedro Mártir",
            municipio = "San Quintín",
            descripcion = "El Parque Nacional Sierra de San Pedro Mártir resguarda el macizo montañoso más alto de la península de Baja California, coronado por el Picacho del Diablo con más de 3,090 metros sobre el nivel del mar.\n\n" +
                "Sus densos bosques de pinos, abetos y álamos temblones albergan al venado bura, el borrego cimarrón y al cóndor de California dentro de un exitoso programa de reintroducción, además de ofrecer miradores con vistas simultáneas al Pacífico y al Mar de Cortés en días despejados.\n\n" +
                "En lo alto del parque opera el Observatorio Astronómico Nacional de la UNAM, elegido por la extraordinaria limpieza atmosférica y oscuridad de sus cielos nocturnos.",
            imagenUrl = "https://www.zonaturistica.com/files/atractivos/2246/A1_2246.jpg"
        ),
        LugarTuristico(
            id = 12,
            nombre = "Bahía y Volcanes de San Quintín",
            municipio = "San Quintín",
            descripcion = "Al sur de Ensenada, la Bahía de San Quintín presenta uno de los paisajes costeros más singulares de México, donde extensos humedales, esteros y playas de arena negra se encuentran enmarcados por una cadena de conos volcánicos extintos como el Monte Ceniza y el volcán Kenton.\n\n" +
                "Sus lagunas costeras son un refugio vital para miles de aves migratorias y endémicas a lo largo del corredor del Pacífico, convirtiéndola en un destino de primer orden para recorridos en kayak, senderismo interpretativo y observación de fauna.\n\n" +
                "La bahía también goza de prestigio gastronómico por sus cultivos sustentables de ostiones japoneses y almejas frescas, que se disfrutan frente al mar junto con espectaculares atardeceres sobre el campo volcánico.",
            imagenUrl = "https://terrapeninsular.org/wp-content/uploads/2023/12/Volcanes-y-humedal-panorama-e1714414966381.jpg"
        )
    )

    fun buscarPorId(id: Int): LugarTuristico? = lugares.find { it.id == id }
}
