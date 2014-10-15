Android Resizer – ReadMe
===
![alt tag](https://raw.githubusercontent.com/BlitzKraig/AndroidResizer/master/src/androidresizer/ResizerIconBlue.gif)

Created by [Craig Currie](https://github.com/BlitzKraig)
Artwork by [Jan Putzan](https://github.com/janputzan)

What is AndroidResizer?
---
AndroidResizer is a simple Java desktop app for automatically re-sizing android assets.

AR will downscale your assets and copy them into an android-style folder structure.

![alt tag](https://raw.githubusercontent.com/BlitzKraig/AndroidResizer/master/src/androidresizer/AResizerScreenShot.png)

Why is AndroidResizer?
---
AR was a personal project to help speed up some of the tedious tasks when dealing with Android assets. With AR, you can scale down from XXHDPI, which can be useful in a few ways. When creating new assets the benefits are obvious, simply create your XXHDPI assets and scale them down straight into your project.

It can also be useful when adding new assets into a project. Instead of getting the new assets for each density and dragging them into each DPI folder, simply drag your XXHDPI asset into it’s folder then run AndroidResizer again to re-scale the folder down.

_NOTE: You may want to back up your assets before running this tool. In the unlikely event that all of your assets get rekt, I will not be held responsible._

####Changelog:-

#####1.0
- Initial Release
- Scale all PNG images in an XXHDPI folder and save them to all lower DPI's (L, M, TV, H, XH)



#####1.0.1
- Added multi-threading to provide user feedback while processing images
- Added ability to choose which DPI outputs to generate
- Fixed transparency issues



#####1.1
- Added JPEG and GIF support (Animation not currently supported)
- Improved scaling operations



#####1.1.1
- Stability improvements
- Output improvements
- Fixed progress bar bug



#####1.2
- Added custom prefix for use with non-standard Android Resource structures (Titanium, PhoneGap etc.)
- Added some tooltips
- Altered some text output to fit with the new prefixing feature
- Added XXHDPI Copy
- Cleaned up variable names
- Disable/enable all controls when sizing is in progress/complete



######PLANNED FEATURES
- iOS support
- Single file support
- Scale from other densities
- Basic upscaling
- Updated design
- SVG support
- Seperate source/destination folders
- Multiple project configurations
- XXXHDPI support
- Scale from other densities
- 9-patch support
- Generation Wizard
- Build-step integration



REFERENCE
---

From http://stackoverflow.com/questions/11581649/about-android-image-size-and-assets-sizes

mdpi is the reference density -- that is, 1 px on an mdpi display is equal to 1 dip. The ratio for asset scaling is:

ldpi | mdpi | tvdpi | hdpi | xhdpi | xxhdpi | xxxhdpi

0.75 | 1       | 1.33  | 1.5   | 2        | 3           | 4

Although you don't really need to worry about tvdpi unless you're developing specifically for Google TV or the original Nexus 7 -- but even Google recommends simply using hdpi assets.

What this means is if you're doing a 48dip image and plan to support up to xhdpi resolution, you should start with a 96px image (144px if you want native assets for xxhdpi) and make the following images for the densities:

ldpi       | mdpi     | tvdpi     | hdpi      | xhdpi      | xxhdpi      | xxxhdpi

36 x 36 | 48 x 48 | 64 x 64  | 72 x 72 | 96 x 96   | 144 x 144 | 192 x 192

And these should display at roughly the same size on any device, provided you've placed these in density-specific folders (e.g. drawable-xhdpi, drawable-hdpi, etc.)	

For reference, the pixel densities for these are:

ldpi   | mdpi  | tvdpi  | hdpi  | xhdpi  | xxhdpi  | xxxhdpi

120   | 160     | 213    | 240   | 320     | 480       | 640

![alt tag](https://raw.githubusercontent.com/BlitzKraig/AndroidResizer/master/src/androidresizer/Resizer.png)
