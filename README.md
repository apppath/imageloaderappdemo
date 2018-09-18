# Image Loader
Image loader library for Android.

## Features
* Image transformations
* Automatic memory and storage caching
* Ability to load images from any custom data type
* Both synchronous and asynchronous image loading modes
* Almost unlimited customization

## Add dependency:

```gradle

dependencies {
    implementation 'com.budiyev.android:image-loader:2.5.5'
}

```

### Simple Usage

```java
        
        ImageView view = findViewById(R.id.image_view);
        // Simply load image from URL into view
        ImageLoader.with(this).from("https://some.url/image").load(view);

```

### Advanced Usage

```java 

    ImageView view = findViewById(R.id.image_view);
    
    ImageLoader.with(this)
                .from("https://some.url/image")
                .size(1000, 1000)
                .roundCorners()
                .placeholder(new ColorDrawable(Color.LTGRAY))
                .errorDrawable(new ColorDrawable(Color.RED))
                .transform(ImageUtils.cropCenter())
                .transform(ImageUtils.convertToGrayScale())
                .load(view);
```
## App Image

<p align="center">
  <img src="https://github.com/apppath/imageloaderappdemo/blob/master/image-loader-home-activity.png"/>
</p>


# Done Work
