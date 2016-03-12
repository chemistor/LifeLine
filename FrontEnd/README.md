# LifeLine Prototype

### Prerequisites
- [Node.js](https://nodejs.org) `>=0.10`
- [Gulp.js](http://gulpjs.com) `>3.8.11`

## Project Setup

`npm install`

## Usage

### Gulp Tasks

##### gulp serve
Serve your source locally into your browser. SCSS files will be converted to CSS and BrowserSync automatically loads any changes to HTML, CSS and JavaScript that you make.

### Coding Preferences

This prototyping system uses Jekyll to encourage component-based development. The layers of HTML are as follows:

1. *app/_layouts* - outer wrapper HTML including doctype, etc.
2. *app/[file]* - specific pages like index, login. The layout is defined at the top of the file.
3. *app/_components/* - specific reusable components that can be included in pages.

Most HTML should be added as components. Not only are these automatically converted by a gulp task into Jekyll includes (app/_includes) for easy re-use, but they are automatically added/updated in the living styleguide (/styleguide in the browser).



