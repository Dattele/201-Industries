Spoofify README
==================

## Citations
This is a Web Player built using the [Spotify Web API](https://developer.spotify.com/web-api/).
All of the features were taken from Possan's webapi-player-example (https://github.com/possan/webapi-player-example).

## How to Run
You will need to run a server. The example is ready to work in the port 8000, so you can do:

    $ python3 -m http.server 8000

and open `http://localhost:8000` in a browser. (This requires python to be installed on your machine.)

## File Structure
Partials folder is a templet folder for loading  
Images holds the buttons for playing, pausing, skipping, and rewinding music.
Filters has two js files one computing time passed and another computing length of a song.


## Features

Most of the functionality offered through the Spotify Web API endpoints is implemented in this player:
- Play 30 second audio previews
- Render track, album and artist information
- Render new releases in Spotify and featured playlists
- Search for tracks
- Fetch user's playlists, rename then and change their visibility
- Delete track from playlist
