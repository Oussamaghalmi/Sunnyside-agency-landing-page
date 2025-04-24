# Define the URL
$url = "https://f921-35-190-128-84.ngrok-free.app/receive"

# Read the message from the 1.txt file in the videos folder
$messageText = Get-Content -Path "C:\Users\pc\Videos\1.txt" -Raw  # Adjust the path accordingly 

# Create the message body as a hashtable with the message content
$body = @{
    message = $messageText
}

# Convert the body to JSON
$jsonBody = $body | ConvertTo-Json

# Send the POST request
$response = Invoke-RestMethod -Uri $url -Method Post -Body $jsonBody -ContentType "application/json"

# Print the response
$response
