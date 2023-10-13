function submitForm() {
    // Getting form values
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const gender = [];
    if (document.getElementById('male').checked) {
        gender.push(document.getElementById('male').value);
    }
    if (document.getElementById('female').checked) {
        gender.push(document.getElementById('female').value);
    }
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    // Displaying form values in a popup
    const popup = document.getElementById('popup');
    const popupData = document.getElementById('popupData');
    popupData.innerHTML = `
        <strong>First Name:</strong> ${firstName} <br>
        <strong>Last Name:</strong> ${lastName} <br>
        <strong>Date of Birth:</strong> ${dob} <br>
        <strong>Country:</strong> ${country} <br>
        <strong>Gender:</strong> ${gender.join(', ')} <br>
        <strong>Profession:</strong> ${profession} <br>
        <strong>Email:</strong> ${email} <br>
        <strong>Mobile Number:</strong> ${mobile} <br>
    `;
    popup.style.display = "flex";
}

function closePopup() {
    // Reset the form and close the popup
    const form = document.getElementById('surveyForm');
    form.reset();
    const popup = document.getElementById('popup');
    popup.style.display = "none";
}