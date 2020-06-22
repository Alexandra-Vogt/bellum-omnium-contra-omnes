# bellum automata contra omnes

This project is on hold for another project.

This is a basic war game for the web where the player battles enemies in space. They are chased about by endless waves of enemies through a procedurally generated star-field with limited fuel and ammo. The goal is not to win but rather to survive for as long as is possible.

I decided that the initial name, *bellum omnium contra omnes*, would probably be better for a multi player game using webrtc and have decided to name the game *bellum automata contra omnes* which is probably more fitting.

## Usage

Run `lein figwheel` in your terminal. Wait for a while until you see `Successfully compiled "resources/public/js/main.js"`. Open [localhost:3449](http://localhost:3449) in your browser.

You can use this while developing your sketch. Whenever you save your source files the browser will automatically refresh everything, providing you with quick feedback. For more information about Figwheel, check the [Figwheel repository on GitHub](https://github.com/bhauman/lein-figwheel).

## Publishing your sketch

Before you publish your sketch, run `lein do clean, cljsbuild once optimized`. This will compile your code and run Google Closure Compiler with advanced optimizations. Take `resources/public/index.html` and `resources/public/js/main.js` and upload them to server of your choice.

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
