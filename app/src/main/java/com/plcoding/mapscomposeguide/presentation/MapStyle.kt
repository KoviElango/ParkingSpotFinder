package com.plcoding.mapscomposeguide.presentation


object MapStyle {

    val json = """
[
{
    "featureType": "all",
    "elementType": "labels",
    "stylers": [
    {
        "visibility": "off"
    }
    ]
},
{
    "featureType": "all",
    "elementType": "labels.text",
    "stylers": [
    {
        "visibility": "off"
    }
    ]
},
{
    "featureType": "all",
    "elementType": "labels.icon",
    "stylers": [
    {
        "visibility": "on"
    }
    ]
},
{
    "featureType": "landscape",
    "elementType": "geometry",
    "stylers": [
    {
        "visibility": "on"
    },
    {
        "color": "#ffffff"
    }
    ]
},
{
    "featureType": "landscape.man_made",
    "elementType": "geometry",
    "stylers": [
    {
        "visibility": "simplified"
    },
    {
        "color": "#1d1d1d"
    }
    ]
},
{
    "featureType": "landscape.man_made",
    "elementType": "geometry.stroke",
    "stylers": [
    {
        "color": "#000000"
    },
    {
        "weight": "10.00"
    }
    ]
},
{
    "featureType": "landscape.natural",
    "elementType": "geometry",
    "stylers": [
    {
        "visibility": "simplified"
    },
    {
        "color": "#000000"
    }
    ]
},
{
    "featureType": "poi",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "visibility": "on"
    },
    {
        "color": "#ffffff"
    }
    ]
},
{
    "featureType": "poi.attraction",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "color": "#ffffff"
    },
    {
        "visibility": "on"
    }
    ]
},
{
    "featureType": "poi.business",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "color": "#ffffff"
    },
    {
        "visibility": "on"
    }
    ]
},
{
    "featureType": "poi.government",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "color": "#ffffff"
    },
    {
        "visibility": "on"
    }
    ]
},
{
    "featureType": "poi.medical",
    "elementType": "geometry",
    "stylers": [
    {
        "color": "#fcfcfc"
    },
    {
        "visibility": "on"
    }
    ]
},
{
    "featureType": "poi.medical",
    "elementType": "labels",
    "stylers": [
    {
        "visibility": "off"
    }
    ]
},
{
    "featureType": "poi.park",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "color": "#788c40"
    },
    {
        "visibility": "on"
    }
    ]
},
{
    "featureType": "poi.place_of_worship",
    "elementType": "geometry",
    "stylers": [
    {
        "invert_lightness": true
    },
    {
        "visibility": "on"
    }
    ]
},
{
    "featureType": "poi.school",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "color": "#ffffff"
    },
    {
        "visibility": "on"
    }
    ]
},
{
    "featureType": "poi.sports_complex",
    "elementType": "geometry",
    "stylers": [
    {
        "color": "#ffffff"
    }
    ]
},
{
    "featureType": "road.highway",
    "elementType": "geometry",
    "stylers": [
    {
        "color": "#bebebe"
    }
    ]
},
{
    "featureType": "road.highway",
    "elementType": "labels",
    "stylers": [
    {
        "visibility": "off"
    }
    ]
},
{
    "featureType": "road.arterial",
    "elementType": "geometry",
    "stylers": [
    {
        "color": "#aeaeae"
    }
    ]
},
{
    "featureType": "road.local",
    "elementType": "geometry",
    "stylers": [
    {
        "color": "#777777"
    }
    ]
},
{
    "featureType": "transit",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "weight": "0.01"
    },
    {
        "saturation": "-33"
    },
    {
        "visibility": "on"
    },
    {
        "hue": "#ff0000"
    }
    ]
},
{
    "featureType": "transit",
    "elementType": "labels.icon",
    "stylers": [
    {
        "visibility": "off"
    }
    ]
},
{
    "featureType": "transit.line",
    "elementType": "geometry",
    "stylers": [
    {
        "color": "#000000"
    },
    {
        "weight": "0.01"
    }
    ]
},
{
    "featureType": "transit.line",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "visibility": "on"
    },
    {
        "color": "#ff0000"
    }
    ]
},
{
    "featureType": "water",
    "elementType": "geometry.fill",
    "stylers": [
    {
        "color": "#7088b0"
    }
    ]
}
]
"""
}