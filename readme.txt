Android Resizer – ReadMe

Changelog:-

1.0
-Initial Release
-Scale all PNG images in an XXHDPI folder and save them to all lower DPI's (L, M, TV, H, XH)

1.0.1
-Added multi-threading to provide user feedback while processing images
-Added ability to choose which DPI outputs to generate
-Fixed transparency issues

1.1
-Added JPEG and GIF support (Animation not currently supported)
-Improved scaling operations

1.1.1
-Stability improvements
-Output improvements
-Fixed progress bar bug

1.2
-Added custom prefix for use with non-standard Android Resource structures (Titanium, PhoneGap etc.)
-Added some tooltips
-Altered some text output to fit with the new prefixing feature
-Added XXHDPI Copy
-Cleaned up variable names
-Disable/enable all controls when sizing is in progress/complete

PLANNED FEATURES
-iOS support
-Single file support
-Scale from other densities
-Basic upscaling
-Update design


==========REFERENCE===========

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
