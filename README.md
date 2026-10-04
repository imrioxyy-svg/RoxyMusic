# RØYX Music — Complete Android foundation

This version is an Android-first music player with a premium RØYX UI and real local-library playback.

## What works
- Reads music from the user's Android music library.
- Search across title, artist and album.
- Play/pause/previous/next using Media3 ExoPlayer.
- Favorites screen and local favorite state.
- Home/Library/Favorites/Settings navigation.
- Media3 service foundation for background/notification playback.
- Architecture is ready for a licensed remote catalog connector.

## Spotify integration
Spotify's Web API can provide catalog metadata, user playlists and playback control with authorization. Playback APIs require Premium, and Spotify's platform rules restrict streaming applications and commercial use. Do not embed or proxy Spotify audio files. See the official developer documentation before connecting an account.

## Build
Open the project in Android Studio and let Gradle sync. Run on an Android 8.0+ device. Android 13+ asks for READ_MEDIA_AUDIO; older versions use READ_EXTERNAL_STORAGE.

## Production roadmap
- OAuth login + secure backend token exchange
- Spotify catalog/profile/playlist connector where permitted
- Licensed streaming provider for in-app remote playback
- Room database for playlists, history and recommendations
- WorkManager for periodic library/index updates
- Android Media3 notification/lock-screen controls
- Equalizer/DSP only where supported by the device and licensed audio pipeline
- Cloud sync and account system
