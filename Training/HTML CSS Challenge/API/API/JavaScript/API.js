/* global $ */
var url = "https://api.nasa.gov/planetary/apod?api_key=jT9a9djmlXvr6QGYLXet52uTP4ycNUGYnqdQeCA7";

$(function() {
  // The original URL without any additional dates attached.
	var originalURL = "https://api.nasa.gov/planetary/apod?api_key=jT9a9djmlXvr6QGYLXet52uTP4ycNUGYnqdQeCA7";
	document.querySelector("#date").valueAsDate = new Date(); // Prepopulate.
	
	$.ajax({ // Initial call to get the current date's information.
    url: url,
    success: function(result) {
      if("copyright" in result) {
        $("#copyright").text("Image Credits: " + result.copyright);
      } else {
        $("#copyright").text("Image Credits: " + "Public Domain");
      }
      
      if(result.media_type == "video") {
        $("#apod_img_id").css("display", "none"); 
        $("#apod_vid_id").attr("src", result.url);
      } else {
        $("#apod_vid_id").css("display", "none"); 
        $("#apod_img_id").attr("src", result.url);
      }
    
    $("#apod_explaination").text(result.explanation);
    $("#apod_title").text(result.title);
    }
  });
	
	$('#requestForm').submit(function () { // Update the date when submitted.
	  url = originalURL + "&date=" + $('#date').val();
	  $.ajax({
      url: url,
      success: function(result){
        if("copyright" in result) {
          $("#copyright").text("Image Credits: " + result.copyright);
        } else {
          $("#copyright").text("Image Credits: " + "Public Domain");
        }
        
        if (result.media_type == "video") {
          $("#apod_img_id").css("display", "none"); 
          $("#apod_vid_id").attr("src", result.url);
        } else {
          $("#apod_vid_id").css("display", "none"); 
          $("#apod_img_id").attr("src", result.url);
        }
      
      $("#apod_explaination").text(result.explanation);
      $("#apod_title").text(result.title);
      }
    });
    
    return false;
  });
});