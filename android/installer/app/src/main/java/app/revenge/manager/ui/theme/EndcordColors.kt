package app.revenge.manager.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/**
 * Medslol's palette: a rich plum base, violet actions, and a bright pink accent that reads as modern and premium.
 */
object Ink {
    val Night = Color(0xFF070910)
    val Panel = Color(0xFF121827)
    val PanelHi = Color(0xFF1B2133)
    val Line = Color(0xFF2E3B57)
    val Ice = Color(0xFFD9C8FF)
    val Cobalt = Color(0xFF8B5CF6)
    val CobaltHi = Color(0xFFB58CFF)
    val Paper = Color(0xFFF8F5FF)
    val Mist = Color(0xFFB9B2CC)
    val Dim = Color(0xFF6F7A94)
    val Bamboo = Color(0xFF52D6C8)
    val Ember = Color(0xFFEC4899)
    val Honey = Color(0xFFFBBF24)

    /** Daylight counterparts, for people who prefer the light theme. */
    val DayBase = Color(0xFFF8F5FF)
    val DayPanel = Color(0xFFEDE7FF)
    val DayPanelHi = Color(0xFFE0D6FF)
    val DayLine = Color(0xFFCEC0F8)
    val DayInk = Color(0xFF120F1E)
    val DaySubtle = Color(0xFF5A4E77)
    val DayCobalt = Color(0xFF7C3AED)
}

val EndcordDarkColors = darkColorScheme(
    primary = Ink.Cobalt,
    onPrimary = Ink.Paper,
    primaryContainer = Color(0xFF2A1F43),
    onPrimaryContainer = Ink.Ice,
    inversePrimary = Ink.DayCobalt,
    secondary = Ink.Ice,
    onSecondary = Ink.Night,
    secondaryContainer = Ink.PanelHi,
    onSecondaryContainer = Ink.Ice,
    tertiary = Ink.Bamboo,
    onTertiary = Ink.Night,
    tertiaryContainer = Color(0xFF123C39),
    onTertiaryContainer = Ink.Bamboo,
    background = Ink.Night,
    onBackground = Ink.Paper,
    surface = Ink.Night,
    onSurface = Ink.Paper,
    surfaceVariant = Ink.PanelHi,
    onSurfaceVariant = Ink.Mist,
    surfaceTint = Ink.Cobalt,
    inverseSurface = Ink.Paper,
    inverseOnSurface = Ink.Night,
    error = Ink.Ember,
    onError = Ink.Night,
    errorContainer = Color(0xFF4A2226),
    onErrorContainer = Color(0xFFFFC9C3),
    outline = Ink.Line,
    outlineVariant = Ink.Line,
    scrim = Color(0xCC0A101C),
    surfaceBright = Ink.PanelHi,
    surfaceDim = Ink.Night,
    surfaceContainerLowest = Color(0xFF0C1322),
    surfaceContainerLow = Color(0xFF131C30),
    surfaceContainer = Ink.Panel,
    surfaceContainerHigh = Color(0xFF1A263E),
    surfaceContainerHighest = Ink.PanelHi,
)

val EndcordLightColors = lightColorScheme(
    primary = Ink.DayCobalt,
    onPrimary = Ink.Paper,
    primaryContainer = Color(0xFFE8DEFF),
    onPrimaryContainer = Color(0xFF2C165C),
    inversePrimary = Ink.Ice,
    secondary = Color(0xFF6D4FD6),
    onSecondary = Ink.Paper,
    secondaryContainer = Ink.DayPanelHi,
    onSecondaryContainer = Ink.DayInk,
    tertiary = Color(0xFF1B9D96),
    onTertiary = Ink.Paper,
    tertiaryContainer = Color(0xFFD7F8F6),
    onTertiaryContainer = Color(0xFF123D39),
    background = Ink.DayBase,
    onBackground = Ink.DayInk,
    surface = Ink.DayBase,
    onSurface = Ink.DayInk,
    surfaceVariant = Ink.DayPanelHi,
    onSurfaceVariant = Ink.DaySubtle,
    surfaceTint = Ink.DayCobalt,
    inverseSurface = Ink.Night,
    inverseOnSurface = Ink.Paper,
    error = Color(0xFFC8443A),
    onError = Ink.Paper,
    errorContainer = Color(0xFFFFDAD5),
    onErrorContainer = Color(0xFF5C120C),
    outline = Ink.DayLine,
    outlineVariant = Ink.DayLine,
    scrim = Color(0x99000000),
    surfaceBright = Color.White,
    surfaceDim = Ink.DayPanelHi,
    surfaceContainerLowest = Color.White,
    surfaceContainerLow = Color(0xFFEDF2F9),
    surfaceContainer = Ink.DayPanel,
    surfaceContainerHigh = Color(0xFFDFE7F3),
    surfaceContainerHighest = Ink.DayPanelHi,
)
