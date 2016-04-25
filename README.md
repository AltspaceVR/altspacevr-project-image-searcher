# AltspaceVR Programming Project - Android Image Searcher

## Instructions

Finish the implementation of an Android app that can be used to search for and save images from the [Pixabay image API][pixabay].

## Goals

We use this test to get a sense of your coding style and to how you creatively solve both a concrete problem and an abstract one. When we receive your project, here is what we will be asking ourselves:

- Does the app allow browsing and searching of images fetched from the API?

- Does the save functionality work properly?

- Are the enhancements creative, challenging to implement, and just plain cool?

- Is the code well structured, easy to read and understand, and organized well?

To work on the project:

- Ensure you have the latest version of Android Studio and the v23 Android Build Tools.

- Fork and clone the repo.

- Open up the project with Android Studio. You can build the project using [Gradle][gradle].

# Part 1

If you’ve tried AltspaceVR on Android, you'll have noticed that we have a number of scrollable views that show preview images of the spaces and events you can visit. In this app, you'll apply similar techniques in order to let users search and browse images and save the ones they like.

The example project should provide a good foundation for the app. The places in the code you need to implement are commented `YOUR CODE HERE`. Also, there is a small example unit test in place, feel free to add additional tests as needed. For your reference, we've also included a sample completed `ImageSearcher.APK` in the Project directory that demonstrates what you should have working after finishing Part 1.

## Part 1a

For Part 1a, you will need to implement the necessary functionality to fetch images info from the API, hand it off to the PhotosFragment, generate the image for rendering, and implement the adapter for the RecyclerView. The methods you'll need to implement are:

* `ApiService.getDefaultPhotos` and `ApiService.searchPhotos` - These methods should call the relevant Pixabay APIs to fetch and search for images, and post the results to the EventBus. We've provided a [Retrofit][retrofit] service you can use, or you can use your HTTP library of choice.

* `PhotosFragment.onEvent` (both overloads) - These methods should receive the events on the event bus, update the fragment properly, and notify the list that the data has changed.

* `ItemsListAdapter.onBindViewHolder` - This method should do the typical RecyclerView lifecycle event and fill in the ViewHolder properly so the images will be drawn in the list.

By the end of this part, you should have photos drawing in the list, they should be scrollable and load as you scroll, and you should be able to run a search against the API and see the results.

## Part 1b

For Part 1b, you will implement the "Save" functionality. For this part:

* Implement the CRUD operations in `DatabaseUtil` so photo information can be queried, saved, and loaded from a local db.

* Update `ItemListAdapter.onBindViewHolder` to have the proper `ClickListener` attached when the user clicks the `saveText` label on the `ViewHolder`. When clicked, this label should toggle between the photo being saved in the user's local db or deleted.

# Part 2 - Enhancements

Now that you have a working app for browsing + saving images, build some functionality that might be fun that showcases your skills and creativity. This is the open-ended part of the project, and is your chance to blow us away!

Some potential ideas:

- Add multiple tabs so you can easily browse your saved images.

- Add the ability to save searches.

- Add some type of photo editing and sharing tools.

- Anything you want! Is there some new Android library or API you want to try? Use this as an excuse. Feel free to add any new Activities to the app as needed.

Feel free to use 3rd party code or assets for this part of the project, keeping in mind our assessment criteria (noted at the top of the README.)

## Deliverable

In your repo, you should clobber this README file with your own describing your project. Any instructions or known issues should be documented in the README as well.

**Please be sure to commit a built APK to your repo**, just in case we have trouble getting your project to build.

E-mail us a link to your Github repo to [projects@altvr.com](mailto:projects@altvr.com). Please include your contact information, and if you haven't submitted it to us already, your resume and cover letter.

We hope you have fun working on the project, and we can't wait to see what you come up with!

[The Altspace Team](http://altvr.com/team/)

[gradle]: http://gradle.org/
[retrofit]: http://square.github.io/retrofit/
[pixabay]:https://pixabay.com/api/docs/
