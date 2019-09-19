/* global $ */

/*
 * Updates the current date and time.
 */
function setTimeAndDate() {
	var date = new Date(); // Get all the appropriate values.
	var year = date.getFullYear();
	var month = String(date.getMonth() + 1).padStart(2, '0');
	var day = String(date.getDate()).padStart(2, '0');
	var hour = String(date.getHours()).padStart(2, '0');
	var timePeriod = (hour >= 12) ? "PM" : "AM";
	
	if (hour > 12) { // Convert from 24-hour clock to a 12-hour one.
		hour -= 12;
		hour = String(hour).padStart(2, '0');
	}
	
	var minute = String(date.getMinutes()).padStart(2, '0');
	var second = String(date.getSeconds()).padStart(2, '0');
	var printDate = hour +':' + minute + ':' + second + " " + timePeriod;
	$("#bottom-clock").text(printDate); // Set bottom-clock's text.
	
	var allTD = document.getElementsByTagName('td');
	
	for (var i = 0; i < allTD.length; i++) { // Highlight the current day.
		allTD[i].classList.remove('currentDay'); // Remove if not applicable.
		
		if (allTD[i].innerHTML == day) { // Add highlight if applicable.
			allTD[i].classList.add('currentDay');
		}
	}
	
	// Set the full-date at the top of the page.
	var dayNames = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday',
		'Friday', 'Saturday'];
	var dayName = dayNames[date.getDay()];
	var currentFullDate = `${dayName}, May ${day} ${year}`;
	$('#full-date').text(currentFullDate);
	
	// Set the date at the top of the calendar.
	var monthNames = ['January', 'February', 'March', 'April', 'May	', 'June',
		'July	', 'August', 'September', 'October', 'November', 'December'];
	var monthName = monthNames[date.getMonth()];
	var currentCalendarTitle = `${monthName}, ${year}`;
	$('#calendar-title').text(currentCalendarTitle);
}

$(function() {
	setTimeAndDate(); // Initial call before the 1-second delay.
	window.setInterval(function() { // Adjust the time and date every second.
		setTimeAndDate();
	}, 1000);
});