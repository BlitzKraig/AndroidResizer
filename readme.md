Android Resizer – ReadMe
===
![alt tag](https://raw.githubusercontent.com/BlitzKraig/AndroidResizer/master/src/androidresizer/ResizerIconBlue.gif)

Created by [Craig Currie](https://github.com/BlitzKraig)

Artwork by [Jan Putzan](https://github.com/janputzan)

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-AndroidResizer-green.svg?style=true)](https://android-arsenal.com/details/1/3274)

What is AndroidResizer?
---
AndroidResizer is a simple Java desktop app for automatically re-sizing android assets.

AR will downscale your assets and copy them into an android-style folder structure.

![alt tag](https://raw.githubusercontent.com/BlitzKraig/AndroidResizer/master/src/androidresizer/AResizerScreenShot.png)

Why is AndroidResizer?
---
AR was a personal project to help speed up some of the tedious tasks when dealing with Android assets. With AR, you can scale down from XXXHDPI, which can be useful in a few ways. When creating new assets the benefits are obvious, simply create your XXXHDPI assets and scale them down straight into your project.

It can also be useful when adding new assets into a project. Instead of getting the new assets for each density and dragging them into each DPI folder, simply drag your XXXHDPI asset into it’s folder then run AndroidResizer again to re-scale the folder down.

_NOTE: You may want to back up your assets before running this tool. In the unlikely event that all of your assets get rekt, I can not be held responsible._

####Changelog:-

#####1.4
Quick release since someone requested this in the project issues:
- Added XXXHDPI support

I'll try to get another version out soon with some more features, and I've come up with an idea for 9-patch support which I'll be attempting to implement soon! Also hoping to get iOS support in the next release, along with the new GUI.

#####1.3
Been a bit lazy recently with this, but the project is progressing!
You should find v1.3 in the releases tab, ready to go.

- Added directory serialization (The program now remembers your last used input directory)
- Added input density choice via combobox
- Fixed TVDPI scaling (checkbox is still unselected by default, as TVDPI is rarely used)
- Fixed rare "Directory is null!" bug
- "Copy XXHDPI with prefix" is now "Copy origin prefix", and works with all densities.
- Added notification beep on resizing completion
- Minor misc. bugs

#####1.2.2
- Fixed XXHDPI copying scaling down to ldpi
- Fixed some output
- Fixed scaling issue for images with no alpha channel 

#####1.2.1
- Added EXE generation
- Added new icons & images
- Updated DMG generation
- Changed to Nimbus L&F
- Made directory field manually editable
- Disable/enable directory field when sizing is in progress/complete
- Removed some unused files/code

#####1.2
- Added custom prefix for use with non-standard Android Resource structures (Titanium, PhoneGap etc.)
- Added some tooltips
- Altered some text output to fit with the new prefixing feature
- Added XXHDPI Copy
- Cleaned up variable names
- Disable/enable all controls when sizing is in progress/complete

#####1.1.1
- Stability improvements
- Output improvements
- Fixed progress bar bug

#####1.1
- Added JPEG and GIF support (Animation not currently supported)
- Improved scaling operations

#####1.0.1
- Added multi-threading to provide user feedback while processing images
- Added ability to choose which DPI outputs to generate
- Fixed transparency issues

#####1.0
- Initial Release
- Scale all PNG images in an XXHDPI folder and save them to all lower DPI's (L, M, TV, H, XH)



######PLANNED FEATURES
- iOS support
- Single file support
- ~~Scale from other densities~~
- Basic upscaling
- Updated design
- SVG support
- Seperate source/destination folders
- Multiple project configurations
- ~~XXXHDPI support~~
- 9-patch support
- Generation Wizard
- Build-step integration

<sup><sup><sup><sup><sup><sup><sup><sup><span style="color:white">Android Image Resizing Asset Resizer Density Scale LDPI MDPI HDPI TVDPI XHDPI XXHDPI XXXHDPI DPI  Resource Res</span></sup></sup></sup></sup></sup></sup></sup></sup>

REFERENCE
---

From [a great StackOverflow post about android densities](http://stackoverflow.com/questions/11581649/about-android-image-size-and-assets-sizes)

mdpi is the reference density -- that is, 1 px on an mdpi display is equal to 1 dip. The ratio for asset scaling is:

ldpi | mdpi | tvdpi | hdpi | xhdpi | xxhdpi | xxxhdpi
--- | --- | --- | --- | --- | --- | --- | ---
0.75 | 1       | 1.33  | 1.5   | 2        | 3           | 4

Although you don't really need to worry about tvdpi unless you're developing specifically for Google TV or the original Nexus 7 -- but even Google recommends simply using hdpi assets.

What this means is if you're doing a 48dip image and plan to support up to xhdpi resolution, you should start with a 96px image (144px if you want native assets for xxhdpi) and make the following images for the densities:

ldpi       | mdpi     | tvdpi     | hdpi      | xhdpi      | xxhdpi      | xxxhdpi
--- | --- | --- | --- | --- | --- | --- | ---
36 x 36 | 48 x 48 | 64 x 64  | 72 x 72 | 96 x 96   | 144 x 144 | 192 x 192

And these should display at roughly the same size on any device, provided you've placed these in density-specific folders (e.g. drawable-xhdpi, drawable-hdpi, etc.)	

For reference, the pixel densities for these are:

ldpi   | mdpi  | tvdpi  | hdpi  | xhdpi  | xxhdpi  | xxxhdpi
--- | --- | --- | --- | --- | --- | --- | ---
120   | 160     | 213    | 240   | 320     | 480       | 640


![alt tag](https://raw.githubusercontent.com/BlitzKraig/AndroidResizer/master/src/androidresizer/Resizer.png)


License
---

The MIT License (MIT)

Copyright (c) 2016 Craig Currie

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
