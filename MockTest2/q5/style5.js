document.addEventListener('DOMContentLoaded', function() {
    var myForm = document.getElementById('myForm');
    var nameField = document.getElementById('name');
    var emailField = document.getElementById('email');
    var phoneField = document.getElementById('phone');
    var passwordField = document.getElementById('password');
    var ageField = document.getElementById('age');
    var genderField = document.getElementById('gender');
    var dobField = document.getElementById('dob');
    var colorField = document.getElementById('color');
  
    myForm.addEventListener('submit', function(event) {
      event.preventDefault();
  
      var isValid = true;
  
      // Reset previous error messages
      var errorElements = document.getElementsByClassName('error');
      for (var i = 0; i < errorElements.length; i++) {
        errorElements[i].textContent = '';
      }
  
      // Validate name
      if (nameField.value.trim() === '') {
        document.getElementById('nameError').textContent = 'Name is required';
        isValid = false;
      }
  
      // Validate email
      var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      if (!emailPattern.test(emailField.value)) {
        document.getElementById('emailError').textContent = 'Invalid email';
        isValid = false;
      }
  
      // Validate phone number
      if (phoneField.validity.patternMismatch) {
        document.getElementById('phoneError').textContent = 'Invalid phone number';
        isValid = false;
      }
  
      // Validate password
      if (passwordField.value.length < 8) {
        document.getElementById('passwordError').textContent = 'Password must be at least 8 characters long';
        isValid = false;
      }
  
      // Validate age
      if (ageField.value < 18 || ageField.value > 100) {
        document.getElementById('ageError').textContent = 'Age must be between 18 and 100';
        isValid = false;
      }
  
      // Validate gender
      if (genderField.value === '') {
        document.getElementById('genderError').textContent = 'Gender is required';
        isValid = false;
      }
  
      // Validate date of birth
      var currentDate = new Date();
      var selectedDate = new Date(dobField.value);
      if (selectedDate >= currentDate) {
        document.getElementById('dobError').textContent = 'Invalid date of birth';
        isValid = false;
      }
  
      // Validate favorite color
      if (colorField.value === '') {
        document.getElementById('colorError').textContent = 'Favorite color is required';
        isValid = false;
      }
  
      // If form is valid, submit the form
      if (isValid) {
        myForm.submit();
      }
    });
  });
  