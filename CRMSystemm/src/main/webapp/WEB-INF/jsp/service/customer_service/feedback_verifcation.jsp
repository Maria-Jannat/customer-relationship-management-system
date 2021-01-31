<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <title> Ghost </title>
        <link rel="stylesheet" href="resources/assets/css/service/customerVerification.css">
        <link rel="stylesheet" href="resources/assets/css/service/voiceRecorder.css">
        <!--FOR VOICE RECORDER-->
        <script type="text/javascript" src="https://code.jquery.com/jquery.min.js"></script>
        <script src="https://stephino.github.io/dist/recorder.js"></script>
    </head>

    <body>

        <div id="sidebar">
            <div class="siderbar-header">
                <a href="signup">
                    <div class="logo-div">
                        <div class="logo-m-first">M</div>
                        <div class="logo-c-first">C</div>
                        <div class="logo-r-first">R</div>
                        <div class="logo-m-second">M</div>
                    </div>
                </a>
            </div>
            <div class="main-left">
                <div class="main-left-content">
                    <h1><span class="rainbow"> •••WE ARE HERE <br>TO HEAR YOU OUT•••</span></h1>
                </div>
            </div>
        </div>
        <div id="rightSideWrapper">
            <header> 
                <div class="sign-up-container-right-header">
                    <div class="header-left">
                        <div class="remonstrance-header-left">

                        </div>
                    </div>
                    <div class="header-center"></div>
                    <div class="header-right">
                        <div class="header-right-left">
                            <!--                            <div class="dropdown">
                                                            <button onclick="myFunction()" class="support-button">Customer Support</button>
                                                            <div id="myDropdown" class="dropdown-content">
                                                                <a href="feedback">Feedback</a>
                                                                <a href="remonstrance">Remonstrance</a>
                                                            </div>
                                                        </div>-->
                        </div>
                        <div class="header-right-right">
                            <p>Have An MCRM Account?</p>
                            <a href="/">Sign In</a>
                        </div>

                    </div>
                </div>
            </header>

            <div class="ContentBox">
                <main> 
                    <h3>You need to provide your mobile number for customer services.</h3>
                    <div class="service-card">
                        <h1>Complain</h1>
                    </div> 
                    <div class="service-card">
                        <h1>Feedback</h1>
                    </div> 
                    <div class="service-card">
                        <h1>Rating</h1>
                    </div> 
                    <div class="sign-in-container">
                        <h1>To Express Your Remonstrance</h1>
                        <form>
                            <h5 style="justify-content: center">Enter Your Phone Number</h5>
                            <input type="text" name="phoneNumber" value="" class="form-control" id="phoneNumber">
                            <div class="button-container">
                                <button id="myBtn" class="submit-button">SUBMIT</button>
                                <button id="" class="cancel-button"><a href="signup">CANCEL</a></button>
                            </div>

                            <!--<button id="myBtn" class="sign-in-button"><a href="#ex1" rel="modal:open">SUBMIT</a></button>-->
                        </form>
                    </div> 

                    <!-- The Modal -->
                    <div id="myModal" class="modal">

                        <!-- Modal content -->
                        <div class="modal-content">
                            <span class="close">&times;</span>
                            <p style="font-weight: bold">Your OTP is <span id="otp"></span></p>
                            <br>
                            <button type="button" onclick="generate()" class="sign-in-button"><a href="#">Generate OTP</a></button>
                            <br><br><hr><br>
                            <p style="font-weight: bold">Enter your OTP below</p>
                            <br>
                            <div class="input-div">
                                <input> <input> <input> <input>
                            </div><br>
                            <button class="verify-button"><a href="feedback">GO NEXT</a></button>

                        </div>

                    </div>

                    <h1>Express Your Feedback</h1>
                    <form>
                        <h5 style="justify-content: center">What did you think of the services?</h5>
                        <input type="radio" name="customerOpinionOnServices">
                        <label>Loved</label><br>
                        <input type="radio" name="customerOpinionOnServices">
                        <label>Liked</label><br>
                        <input type="radio" name="customerOpinionOnServices">
                        <label>Neutral</label><br>
                        <input type="radio" name="customerOpinionOnServices">
                        <label>Disliked</label>
                        <br/>
                        <h5 style="justify-content: center">Why?</h5>
                        <textarea type="textarea" class="form-control" name="customerOpinionReason"></textarea><br>
                        <br/>
                        <h5 style="justify-content: center; margin-top: -10px;">How satisfied you are being connected with us?</h5>
                        <input type="radio" name="customerSatisfactionLevel">
                        <label>Loved</label><br>
                        <input type="radio" name="customerSatisfactionLevel">
                        <label>Satisfied</label><br>
                        <input type="radio" name="customerSatisfactionLevel">
                        <label>Not Satisfied</label><br>

                        <h5 style="justify-content: center; margin-top: 8px;">If you have other opinion</h5>
                        <textarea type="textarea" class="form-control" name="customerOtherOpinion"></textarea>

                        <h5 style="justify-content: center; margin-top: 8px;">Enter your email address</h5>
                        <input type="email" class="form-control" name="customerEmail">

                         <h1 style="justify-content: center; margin-top: 8px;">Audio clip</h1>
                        
                        <div class="button-container">
                            <input type="submit" id="myBtn" class="submit-button" value="SUBMIT">
                            <button id="myBtn" class="cancel-button"><a href="signup">CANCEL</a></button>
                        </div>

                    </form>

                    <div class="holder">
                        <div data-role="controls">
                            <button>Record</button>
                        </div>
                        <div data-role="recordings"></div>
                    </div>


                    <!--COMPLAIN-->
                    <h1>COMPLAIN HERE</h1>
                    <form>
                        <h5 style="justify-content: center">Complain code</h5>
                        <input type="text" name="customerComplainCode">
                        <h5 style="justify-content: center">Complain Title</h5>
                        <input type="text" name="customerComplainTitle">
                        <h5 style="justify-content: center">Complain Details</h5>
                        <textarea type="textarea" name="customerComplainDetails"></textarea>
                        <h5 style="justify-content: center">Complain Mobile</h5>
                        <input type="text" name="customerMobile">
                        <h5 style="justify-content: center">Complain Email</h5>
                        <input type="email" name="customerEmail">


                        <div class="button-container">
                            <input type="submit" id="myBtn" class="submit-button" value="SUBMIT">
                            <button id="myBtn" class="cancel-button"><a href="signup">CANCEL</a></button>
                        </div>

                    </form>



                    <hr><br>

                </main>



                <!--                <section>
                                    Section
                                </section>
                
                                <footer> 
                                    Footer 
                                </footer>-->

            </div>

        </div>

    </body>




</html>
<script>
    /* When the user clicks on the button, 
     toggle between hiding and showing the dropdown content */
    function myFunction() {
        document.getElementById("myDropdown").classList.toggle("show");
    }

    // Close the dropdown if the user clicks outside of it
    window.onclick = function (event) {
        if (!event.target.matches('.support-button')) {
            var dropdowns = document.getElementsByClassName("dropdown-content");
            var i;
            for (i = 0; i < dropdowns.length; i++) {
                var openDropdown = dropdowns[i];
                if (openDropdown.classList.contains('show')) {
                    openDropdown.classList.remove('show');
                }
            }
        }
    }

    function generate() {
        let num = '1234567890';
        let OTP = '';
        for (let i = 0; i < 4; i++) {
            OTP += num[Math.floor(Math.random() * 10)];
        }
        document.getElementById('otp').innerHTML = OTP;
    }

// Get the modal
    var modal = document.getElementById("myModal");

// Get the button that opens the modal
    var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
    var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
    btn.onclick = function () {
        modal.style.display = "block";
    }

// When the user clicks on <span> (x), close the modal
    span.onclick = function () {
        modal.style.display = "none";
    }

// When the user clicks anywhere outside of the modal, close it
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }




//FOR RECORDER
    jQuery(document).ready(function () {
        var $ = jQuery;
        var myRecorder = {
            objects: {
                context: null,
                stream: null,
                recorder: null
            },
            init: function () {
                if (null === myRecorder.objects.context) {
                    myRecorder.objects.context = new (
                            window.AudioContext || window.webkitAudioContext
                            );
                }
            },
            start: function () {
                var options = {audio: true, video: false};
                navigator.mediaDevices.getUserMedia(options).then(function (stream) {
                    myRecorder.objects.stream = stream;
                    myRecorder.objects.recorder = new Recorder(
                            myRecorder.objects.context.createMediaStreamSource(stream),
                            {numChannels: 1}
                    );
                    myRecorder.objects.recorder.record();
                }).catch(function (err) {});
            },
            stop: function (listObject) {
                if (null !== myRecorder.objects.stream) {
                    myRecorder.objects.stream.getAudioTracks()[0].stop();
                }
                if (null !== myRecorder.objects.recorder) {
                    myRecorder.objects.recorder.stop();

                    // Validate object
                    if (null !== listObject
                            && 'object' === typeof listObject
                            && listObject.length > 0) {
                        // Export the WAV file
                        myRecorder.objects.recorder.exportWAV(function (blob) {
                            var url = (window.URL || window.webkitURL)
                                    .createObjectURL(blob);

                            // Prepare the playback
                            var audioObject = $('<audio controls></audio>')
                                    .attr('src', url);

                            // Prepare the download link
                            var downloadObject = $('<a>&#9660;</a>')
                                    .attr('href', url)
                                    .attr('download', new Date().toUTCString() + '.wav');

                            // Wrap everything in a row
                            var holderObject = $('<div class="row"></div>')
                                    .append(audioObject)
                                    .append(downloadObject);

                            // Append to the list
                            listObject.append(holderObject);
                        });
                    }
                }
            }
        };

        // Prepare the recordings list
        var listObject = $('[data-role="recordings"]');

        // Prepare the record button
        $('[data-role="controls"] > button').click(function () {
            // Initialize the recorder
            myRecorder.init();

            // Get the button state 
            var buttonState = !!$(this).attr('data-recording');

            // Toggle
            if (!buttonState) {
                $(this).attr('data-recording', 'true');
                myRecorder.start();
            } else {
                $(this).attr('data-recording', '');
                myRecorder.stop(listObject);
            }
        });
    });
    
    $("#myBtn").on("click", function(){
//        alert()
         $.get("/feedverification",
  {
    phoneNumber : $("#phoneNumber").val()
  },
  function(data, status){
    alert("Data: " + data + "\nStatus: " + status);
  });
    })
</script>