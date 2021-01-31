<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <title> Ghost </title>
        <link rel="stylesheet" href="resources/assets/css/service/feedbackCreateStyle1.css">
        <link rel="stylesheet" href="resources/assets/css/entry/dropdownButtonSignUp.css">
        <link rel="stylesheet" href="resources/assets/css/service/voiceRecorder.css">
        <!--FOR VOICE RECORDER-->
        <script type="text/javascript" src="https://code.jquery.com/jquery.min.js"></script>
        <script src="https://stephino.github.io/dist/recorder.js"></script>
        <!--<link rel="stylesheet" href="resources/assets/css/service/glowingButton.css">-->
        <!--        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
        
                 jQuery Modal 
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />-->
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
                    <h1><span class="rainbow"> •••YOUR OPINION MATTERS THE MOST TO US•••</span></h1>
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
                    <div class="sign-in-container">
                        <h1>Express Your Feedback</h1>
                        <form>
                            <h5 style="justify-content: center">What did you think of the services?</h5>
                            <input type="radio" name="remonstrance">
                            <label>Loved</label><br>
                            <input type="radio" name="remonstrance">
                            <label>Liked</label><br>
                            <input type="radio" name="remonstrance">
                            <label>Neutral</label><br>
                            <input type="radio" name="remonstrance">
                            <label>Disliked</label>
                            <br/>
                            <h5 style="justify-content: center">Why?</h5>
                            <textarea type="textarea" class="form-control" name="leadDescription"></textarea><br>
                            <br/>
                            <h5 style="justify-content: center; margin-top: -10px;">How satisfied you are being connected with us?</h5>
                            <input type="radio" name="remonstrance">
                            <label>Loved</label><br>
                            <input type="radio" name="remonstrance">
                            <label>Satisfied</label><br>
                            <input type="radio" name="remonstrance">
                            <label>Not Satisfied</label><br>

                            <h5 style="justify-content: center; margin-top: 8px;">If you have other opinion</h5>
                            <textarea type="textarea" class="form-control" name=""></textarea>

                            <h5 style="justify-content: center; margin-top: 8px;">Enter your email address</h5>
                            <input type="email" class="form-control" name="">
                            
                            <div class="button-container">
                                <input type="submit" id="myBtn" class="submit-button" value="SUBMIT">
                                <button id="myBtn" class="cancel-button"><a href="signup">CANCEL</a></button>
                            </div>

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
                    <div class="holder">
                        <div data-role="controls">
                            <button>Record</button>
                        </div>
                        <div data-role="recordings"></div>
                    </div>
                    <!--<button>Hover Me</button>-->
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
        </script>