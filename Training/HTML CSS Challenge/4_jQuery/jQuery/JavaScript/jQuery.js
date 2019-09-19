/* global $ */
/*
 * Add a value to either the left or right list.
 */
function addToList(specificList) {
  if (specificList === "left") { // Add an item to the left list.
    $("#listLeft").append(`
    <li class="ui-state-default">
      ${$("input[name=inputLeft]").val()}
    </li>
    `);
  } else { // Add an item to the right list.
    $("#listRight").append(`
    <li class="ui-state-default">
      ${$("input[name=inputRight]").val()}
    </li>
    `);
  }
}

/*
 * Checks if name, email, and password are all at least three characters, and
 * the email field has an @ symbol.
 */
function validateFields() {
  var name = $("input[name=name]").val();
  var email = $("input[name=email]").val();
  var password = $("input[name=password]").val();
  
  if (name.length < 3 || email.length < 3 || password.length < 3) { // Length.
    alert("All fields must be at least three characters or more.");
    
    return false;
  } else {
    if (email.indexOf("@") == -1) { // Email has no @.
      alert("Email does not have an @ symbol.");
      
      return false;
    } else {
      return true;
    }
  }
}

/*
 * Adds the values of the dialog fields to the table.
 */
function addFields() {
  $("tbody").append(`
  <tr>
    <td>${$("input[name=name]").val()}</td>
    <td>${$("input[name=email]").val()}</td>
    <td>${$("input[name=password]").val()}</td>
  </tr>
  `);
}

$(function() {
  /* Two Lists. */
  $("#listLeft, #listRight").sortable({ // Connect both sortable lists.
    connectWith: ".sortableList",
    receive: function(e, ui) {
      sortableIn = 1;
    },
    over: function(e, ui) {
      sortableIn = 1;
    },
    out: function(e, ui) {
      sortableIn = 0;
    },
    beforeStop: function(e, ui) { // Remove item if dragged out.
      if (sortableIn == 0) { 
        ui.item.remove(); 
      }
    }
  }).disableSelection();
  
  $("#buttonLeft").click(function() { // Add content to the left list.
    addToList("left");
  });
  
  $("#buttonRight").click(function() { // Add content to the right list.
    addToList("right");
  });
  
  /* Table. */
  $("#create-new").click(function() { // Show dialog box.
    $("#dialog").dialog();
    $("#dialog").css("display", "visible");
  });
  
  $("#dialog-submit").click(function() { // Validate and add dialog fields.
    var valid = validateFields(); // Check if all fields are valid.
    
    if (valid) { // All fields are valid.
      addFields(); // Add fields to the table.
    }
    
    return false; // Prevent page from reloading.
  });
});