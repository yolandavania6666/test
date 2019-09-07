Private VideoView mVideoView;
Private string filePath = new String();
filePath = "xxxx"; //filepath goes here
Public class playMovie(string movieid,int episodeOfLastWatch, int secondOfLastWatch){
  mVideoView.setVideoPath(filePath.concat(movieid).concat(Integer.toString(episodeOfLastWatch)));
  mVideoView.seekTo(secondOfLastWatch);
  mVideoView.start();
}
